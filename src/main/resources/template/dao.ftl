package ${packagePath};

import java.util.List;

import ${modelPath}.${className};

/**
 * interface ${className}
 *
 */
public interface ${className}Mapper {

	/*
	 * 增加
	 * @param ${modelParam}
	 *
	 */
	 int insert(${className} ${modelParam});

	 /*
	 * 删除
	 * @param ${modelParam}
	 *
	 */
	 int delete(${className} ${modelParam});

	 /*
	  * 更新
	  * @param ${modelParam}
	  *
	  */
	 int update(${className} ${modelParam});

	 /*
	  * 根据主键查询
	  * @param ${modelParam}
	  *
	  */
     List<${className}> select(${className} ${modelParam});

      /*
	  * 根据主键查询
	  * @param ${modelParam}
	  *
	  */
      ${className} get(${className} ${modelParam});
}