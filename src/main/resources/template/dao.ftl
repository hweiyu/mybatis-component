package ${packagePath};

import java.util.List;
import java.util.Map;

import ${importPath};

/**
 * interface ${className}Dao
 *
 */
public interface ${data.className} {

		/********************
	 	 * 增加
	 	 * @param ${data.varName}
	 	 *
	 	 *******************/
	 	void insert(${data.className} ${data.varName});

		/********************
	 	 * 增加Selective
	 	 * @param ${data.varName}
	 	 *
	 	 *******************/
	    void insertSelective(${data.className} ${data.varName});

	    /********************
	 	 * 删除
	 	 * @param ${pkProperty}
	 	 *
	 	 *******************/
	    void delete(${pkPropertyType} ${pkProperty});

	    /********************
	 	 * 更新Selective
	 	 * @param ${data.varName}
	 	 *
	 	 *******************/
	    void updateByPrimaryKeySelective(${data.className} ${data.varName});

	    /********************
	 	 * 更新
	 	 * @param ${data.varName}
	 	 *
	 	 *******************/
	    void update(${data.className} ${data.varName});

	    /********************
	 	 * 根据主键查询
	 	 * @param ${pkProperty}
	 	 *
	 	 *******************/
         ${data.className} selectByPrimaryKey(${pkPropertyType} ${pkProperty});

}