package com.weiziplus.muteki.core.pc.system.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author wanglongwei
 * @date 2020/08/26 14/36
 */
@Data
public class UserQueryDto implements Serializable {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("最后活跃时间")
    private String lastActiveTime;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("最后活跃时间排序")
    private String lastActiveTimeSort = "DESC";

    @ApiModelProperty("创建时间排序")
    private String createTimeSort = "DESC";


}
