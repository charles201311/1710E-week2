package com.bobo.week2.utils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.bobo.week2.domain.AreaEnum;

public class AreaEnumUtil  extends BaseTypeHandler<AreaEnum>{
	// 用于定义设置参数时，该如何把Java类型的参数转换为对应的数据库类型
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, AreaEnum parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getCode());
		
	}
	// 用于定义通过字段名称获取字段数据时，如何把数据库类型转换为对应的Java类型
	@Override
	public AreaEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
		int i = rs.getInt(columnName);
		if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的值，定位Enum子类
            return locateEnum(i);
        }
	}

	// 用于定义通过字段索引获取字段数据时，如何把数据库类型转换为对应的Java类型
	@Override
	public AreaEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		 // 根据数据库存储类型决定获取类型，本例子中数据库中存放int类型
        // String i = rs.getString(columnIndex);
		System.out.println("======================================");
        int i = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的值，定位Enum子类
            return locateEnum(i);
        }


	}
	// 用定义调用存储过程后，如何把数据库类型转换为对应的Java类型

	@Override
	public AreaEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		  // 根据数据库存储类型决定获取类型，本例子中数据库中存放int类型
        // String i = cs.getString(columnIndex);
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的值，定位Enum子类
            return locateEnum(i);
        }
	}
	 /**
     * 枚举类型转换
     * @param value 数据库中存储的自定义属性
     * @return value对应的枚举类
     */
    private AreaEnum locateEnum(int value) {
        for (AreaEnum status : AreaEnum.values()) {
            if (status.getCode() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的枚举类型：" + value);
    }

}
