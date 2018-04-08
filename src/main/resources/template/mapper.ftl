<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 <#assign start="#">
 <#assign start=start+"{">
 <#assign end="}">
<!-- namespace必须指向Dao接口 -->
<mapper namespace="${mapperPath}.${className}Mapper">

    <resultMap id="${className}ResultMap" type="${modelPath}.${className}">
		<#list fields as c>
            <id column="${c.jdbcName}" jdbcType="${c.jdbcType}" property="${c.javaName}" />
        </#list>
    </resultMap>

    <sql id="Base_Column_List">
		<#list fields as c>
            ${c.jdbcName}<#if c_has_next>,</#if>
        </#list>
    </sql>

    <insert id="insert" parameterType="${modelPath}.${className}">
        insert into ${table}
        <trim prefix="(" suffix=")" suffixOverrides="," >
  		    <#list fields as c>
                <if test="${c.javaName} != null and ${c.javaName}!='' " >
                    ${c.jdbcName}<#if c_has_next>,</#if>
                </if>
            </#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides="," >
			<#list fields as c>
                <if test="${c.javaName} != null and ${c.javaName}!='' " >
                    ${start}${c.javaName},jdbcType=${c.jdbcType}${end}<#if c_has_next>,</#if>
                </if>
            </#list>
        </trim>
    </insert>

    <delete id="delete" parameterType="${modelPath}.${className}">
        delete from ${table}
        <where>
            <#list fields as c>
            <#if c.key>
                <if test="${c.javaName} != null and ${c.javaName}!='' " >
                    ${c.jdbcName} = ${start}${c.javaName}${end}<#if c_has_next>,</#if>
                </if>
            </#if>
            </#list>
        </where>
    </delete>

    <update id="update" parameterType="${modelPath}.${className}">
        update ${table}
        <set>
            <#list fields as c>
                <#if !c.key>
                    <if test="${c.javaName} != null and ${c.javaName}!='' " >
                        ${c.jdbcName}=${start}${c.javaName},jdbcType=${c.jdbcType}${end}<#if c_has_next>,</#if>
                    </if>
                </#if>
            </#list>
        </set>
        <where>
            <#list fields as c>
            <#if c.key>
                <if test="${c.javaName} != null and ${c.javaName}!='' " >
                    ${c.jdbcName} = ${start}${c.javaName}${end}<#if c_has_next>,</#if>
                </if>
            </#if>
            </#list>
        </where>
    </update>

    <select id="select" parameterType="${modelPath}.${className}" resultMap="${className}BaseResultMap">
        select <include refid="Base_Column_List"/>
        from ${table}
        <where>
            <#list fields as c>
                <#if c.key>
                    <if test="${c.javaName} != null and ${c.javaName}!='' " >
                        ${c.jdbcName} = ${start}${c.javaName}${end}<#if c_has_next>,</#if>
                    </if>
                </#if>
            </#list>
        </where>
    </select>

    <select id="get" parameterType="${modelPath}.${className}" resultMap="${className}BaseResultMap">
        select <include refid="Base_Column_List"/>
        from ${table}
        <where>
            <#list fields as c>
                <#if c.key>
                    <if test="${c.javaName} != null and ${c.javaName}!='' " >
                        ${c.jdbcName} = ${start}${c.javaName}${end}<#if c_has_next>,</#if>
                    </if>
                </#if>
            </#list>
        </where>
    </select>

</mapper>