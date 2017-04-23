package cn.com.aoaodou.paser;

import cn.com.aoaodou.model.Pageable;

/**
 * 类的描述信息
 *
 * @author panzhuowen
 * @version 1.0.1
 */
public interface SqlParser {

    String getPageSql(String sql, Pageable pageable);

}
