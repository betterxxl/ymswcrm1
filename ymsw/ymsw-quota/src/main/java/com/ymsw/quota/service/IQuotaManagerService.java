package com.ymsw.quota.service;

import com.ymsw.quota.domain.QuotaManager;
import java.util.List;

/**
 * 配额管理Service接口
 * 
 * @author ymsw
 * @date 2020-06-04
 */
public interface IQuotaManagerService 
{
    /**
     * 查询配额管理
     * 
     * @param quotaId 配额管理ID
     * @return 配额管理
     */
    public QuotaManager selectQuotaManagerById(Long quotaId);

    /**
     * 查询配额管理列表
     * 
     * @param quotaManager 配额管理
     * @return 配额管理集合
     */
    public List<QuotaManager> selectQuotaManagerList(QuotaManager quotaManager);

    /**
     * 新增配额管理
     * 
     * @param quotaManager 配额管理
     * @return 结果
     */
    public int insertQuotaManager(QuotaManager quotaManager);

    /**
     * 修改配额管理
     * 
     * @param quotaManager 配额管理
     * @return 结果
     */
    public int updateQuotaManager(QuotaManager quotaManager);

    /**
     * 批量删除配额管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuotaManagerByIds(String ids);

    /**
     * 删除配额管理信息
     * 
     * @param quotaId 配额管理ID
     * @return 结果
     */
    public int deleteQuotaManagerById(Long quotaId);
}
