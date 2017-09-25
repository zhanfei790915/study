package com.gene.study.core.entity;

/**
 * UserException : 用户自定义异常
 * @author Administrator
 * @since 2017-09-25 8:58
 */
public class UserException extends RuntimeException {

	private static final long serialVersionUID = -6338795859789028988L;
	/**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
