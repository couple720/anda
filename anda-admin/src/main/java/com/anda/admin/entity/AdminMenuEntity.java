package com.anda.admin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_admin_menu")
@EntityListeners(value = AuditingEntityListener.class)
public class AdminMenuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private AdminMenuEntity parent;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "icon", nullable = false)
    private String icon;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "visible", nullable = false)
    private Integer visible;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "permission", nullable = false)
    private String permission;

    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;

    @ManyToMany(mappedBy = "menus")
    private List<AdminRoleEntity> roles;
}
