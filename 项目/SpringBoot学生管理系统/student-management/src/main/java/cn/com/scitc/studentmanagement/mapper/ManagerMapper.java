package cn.com.scitc.studentmanagement.mapper;

import cn.com.scitc.studentmanagement.model.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Tue Jul 20 14:47:06 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Tue Jul 20 14:47:06 CST 2021
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Tue Jul 20 14:47:06 CST 2021
     */
    Manager selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Tue Jul 20 14:47:06 CST 2021
     */
    List<Manager> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Tue Jul 20 14:47:06 CST 2021
     */
    int updateByPrimaryKey(Manager record);

    Manager selectByUserName(String userName);
}