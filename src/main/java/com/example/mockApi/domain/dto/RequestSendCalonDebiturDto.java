package com.example.mockApi.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RequestSendCalonDebiturDto {
    private String idStatus;
    private String nik;
    private String nomorRegistry;
    private String nama;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate tanggalLahir;
    private String jenisKelamin;
    private String maritasSts;
    private String pendidikan;
    private String pekerjaan;
    private String alamat;
    private String kodeKabKota;
    private String kodePos;
    private String npwp;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate mulaiUsaha;
    private String alamatUsaha;
    private String ijinUsaha;
    private BigDecimal modalUsaha;
    private Integer jumlahPekerja;
    private BigDecimal jumlahKredit;
    private Boolean isLinkage;
    private String linkage;
    private String noHp;
    private String uraianAgunan;
    private Boolean isSubsidized;
    private String subsidiSebelumnya;
}

