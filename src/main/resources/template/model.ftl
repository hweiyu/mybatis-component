package ${packagePath};

/**
 * TABLE_NAME:(${table})
 */
public class ${className} {

<#list fields as c>
    /**
     * ${c.javaDoc}
	 */
	private ${c.type} ${c.name};

</#list>

<#list fields as c>
	public ${c.type} get${c.getMethod}() {
		return this.${c.name};
	}

	public void set${c.setMethod}(${c.type} ${c.name}) {
		this.${c.name} = ${c.name};
	}
</#list>

}