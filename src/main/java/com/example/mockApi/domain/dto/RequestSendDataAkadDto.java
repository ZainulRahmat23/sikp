package com.example.mockApi.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RequestSendDataAkadDto {
    private String nik, rekeningLama, rekeningBaru, nomorAkad, kodePenjamin, nomorPenjamin, sektor, negaraTujuan;
    private int statusAkad, statusRekenign, skema, status;
    private BigDecimal nilaiAkad, nilaiDijamin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate tglAkad, tglJatuhTempo;

//    {"nik":"6472062607921232","rekening_lama":"807068199","rekening_baru":"807068199","status_akad":"1",
//    "status_rekening":"1",
//    "nomor_akad":"SKC-JKT/1636/PK - KI KUR/2023",
//    "tgl_akad":"27072023","tgl_jatuh_tempo":"26072024","nilai_akad":"50000000","kode_penjamin":"2",
//    "nomor_penjaminan":"69.55.18.00079.7.99.","nilai_dijamin":"50000000",
//    "skema":"11","sektor":"527200","negara_tujuan":"","status":0}


//    channelId":"ELO","noKK":"","nik":"3301055005931235",
//    "namaLengkap":"MERLINA NEVITA ANDRIANI",
//    "jenisKelamin":"PEREMPUAN",
//    "tempatLahir":"",
//    "tanggalLahir":"10/05/1993",
//    "statusKawin":"",
//    "jenisPekerjaan":"",
//    "namaIbu":"",
//    "alamat":"",
//    "noProvinsi":"",
//    "noKabupaten":"",
//    "noKecamatan":"",
//    "noKelurahan":"",
//    "namaProvinsi":"","namaKabupaten":"","namaKecamatan":"","namaKelurahan":"","rw":"","rt":"","threshold":"100"}

}
