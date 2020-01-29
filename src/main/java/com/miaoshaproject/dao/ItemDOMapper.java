package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemDO;
import com.miaoshaproject.dataobject.ItemDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    long countByExample(ItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int deleteByExample(ItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    List<ItemDO> selectByExample(ItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    ItemDO selectByPrimaryKey(Integer id);

    List<ItemDO> listItem();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") ItemDO record, @Param("example") ItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int updateByExample(@Param("record") ItemDO record, @Param("example") ItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jan 28 11:10:11 CST 2020
     */
    int updateByPrimaryKey(ItemDO record);
}