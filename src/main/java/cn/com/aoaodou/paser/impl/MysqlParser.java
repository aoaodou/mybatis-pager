package cn.com.aoaodou.paser.impl;

import cn.com.aoaodou.model.Pageable;

/**
 * 类的描述信息
 *
 * @author panzhuowen
 * @version 1.0.1
 */
public class MysqlParser extends AbstractSqlParser {

    @Override
    public String getPageSql(String sql, Pageable pageable) {
        return sql + this.getSortSql(pageable) + " limit " + getCurrentResult(pageable) + "," + pageable.getPageSize();
    }

    @Override
    void getZhSortField(StringBuilder sortSql, String sortField) {
        sortSql.append("CONVERT(").append(sortField).append(" USING gbk)");
    }

    @Override
    void getNumSortField(StringBuilder sortSql, String sortField) {
        sortSql.append("CONVERT(").append(sortField).append(",SIGNED)");
    }
}
