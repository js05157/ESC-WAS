package com.ESC_club.esc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "shop_usage_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopUsageHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Mileage mileage;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Member student;

    private LocalDateTime exchangeRequestDate;


}
