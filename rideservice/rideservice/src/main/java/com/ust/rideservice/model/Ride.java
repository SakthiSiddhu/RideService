package com.ust.rideservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  long rideid;
    public long userid;
    public  String source;
    public  String dest;
    public double distance;
    public String status;

    @Override
    public String toString() {
        return "Ride{" +
                "rideid=" + rideid +
                ", userid=" + userid +
                ", source='" + source + '\'' +
                ", dest='" + dest + '\'' +
                ", distance=" + distance +
                ", status='" + status + '\'' +
                '}';
    }
}
