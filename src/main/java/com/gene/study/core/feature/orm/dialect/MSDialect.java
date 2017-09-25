package com.gene.study.core.feature.orm.dialect;

/**
 * MSSQL 数据库方言
 * 
 * @author Administrator
 * @since 2017-09-25 11:34
 **/
public class MSDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MSPageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MSPageHepler.getCountString(sql);
    }
}
