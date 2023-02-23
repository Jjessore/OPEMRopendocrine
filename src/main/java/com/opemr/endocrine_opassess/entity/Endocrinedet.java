package com.opemr.endocrine_opassess.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endocrine_opassessment")
@IdClass(PKkey.class)
public class Endocrinedet {

    @Id
    @Column(name="EO_UHID")
    private int UHID;

    @Id
    @Column(name = "EO_ENCOUNTERID")
    private String encounterid;
    @Column(name = "EO_presenting_complaint")
    private String presenting_complaints;
    @Column(name = "EO_presenting_complaint_det")
    private String presenting_complaints_det;
    @Column(name = "EO_pasthist_medical")
    private String past_hist_medical;
    @Column(name = "EO_pasthist_surgical")
    private String past_hist_surgical;
    @Column(name = "EO_rel_investigations")
    private String rel_investigations;
    @Column(name = "EO_current_medication")
    private String current_medications;
    @Column(name = "EO_family_history")
    private String family_history;
    @Column(name = "EO_prsnl_hist_mar_status")
    private int marital_status;
    @Column(name = "EO_prsnl_hist_noofchild")
    private String no_of_child;
    @Column(name = "EO_prsnl_hist_lstchild_birth")
    private String last_child_birth;
    @Column(name = "EO_mnstrl_hist_cycles")
    private String mnstrl_hist_cycles;

    @Column(name = "EO_mnstrl_hist_cycles_rmrk")
    private String mnstrl_hist_cycles_rmrk;
    @Column(name = "EO_mnstrl_hist_amnrh")
    private String mnstrl_hist_amnrh;

    @Column(name = "EO_mnstrl_hist_amnrh_rmrk")
    private String mnstrl_hist_amnrh_rmrk;
    @Column(name = "EO_mnstrl_hist_mnps")
    private int mnstrl_hist_mnps;
    @Column(name = "EO_mnstrl_hist_dur")
    private String mnstrl_hist_dur;
    @Column(name = "EO_smoking")
    private String smoking_rmrk;
    @Column(name = "EO_alcohol")
    private String alcohol_rmrk;
    @Column(name = "EO_clin_exam_pallor")
    private String clin_exam_pallor;
    @Column(name = "EO_clin_exam_Odma")
    private int clin_exam_Odema;
    @Column(name = "EO_clin_exam_thyrd")
    private String clin_exam_thyroid_rmrk;
    @Column(name = "EO_clin_exam_opthal")
    private int clin_exam_opthlmpthy;


    @Column(name="EO_clin_exam_opthal_rmrk")
    private String clin_exam_opthlmpthy_rmrk;
    @Column(name = "EO_clin_exam_cerv_lymph_adnpthy")
    private int clin_exam_crvcl_lymph_adnpthy;

    @Column(name="EO_clin_exam_cerv_lymph_adnpthy_rmrk")
    private String clin_exam_crvcl_lymph_adnpthy_rmrk;
    @Column(name = "EO_clin_exam_othr_findings")
    private String clin_exam_othr_findings;
    @Column(name = "EO_cvs")
    private String cvs_rmrk;
    @Column(name = "EO_resp_systm")
    private String rsprtrysystm_rmrk;
    @Column(name = "EO_abd_liver")
    private String abd_liver;
    @Column(name = "EO_abd_spleen")
    private String abd_spleen;
    @Column(name = "EO_abd_othr_findings")
    private String abd_othr_fndngs;
    @Column(name = "EO_brst_tanner_stage")
    private int tnnrstg_brst;
    @Column(name = "EO_pub_hair_tanner_stage")
    private int tnnrstg_pbchr;
    @Column(name = "EO_stretched_pen_length")
    private String strch_pen_len;
    @Column(name = "EO_tstclr_vol_right")
    private String tstclr_vol_right;
    @Column(name = "EO_tstclr_vol_left")
    private String tstclr_vol_left;
    @Column(name = "EO_cns")
    private String cns_rmrk;
    @Column(name = "EO_visual_fields")
    private String vslflds_rmrk;
    @Column(name = "EO_fundus")
    private String fundus_rmrk;
    @Column(name = "EO_extr_oclr_mvmnt")
    private String extr_oclr_mvmnts_rmrk;

    @Column(name = "EO_reflexes")
    private int rflxs;
    @Column(name = "EO_monofil_testing")
    private String monofil_testing;
    @Column(name = "EO_feet_corns")
    private String feet_corns_rmrk;

    @Column(name = "EO_feet_callosities")
    private String feet_callosities_rmrk;
    @Column(name = "EO_feet_fissures")
    private String feet_fissures_rmrk;
    @Column(name = "EO_feet_ulcers")
    private String feet_ulcers_rmrk;
    @Column(name = "EO_feet_deformities")
    private String feet_deformities_rmrk;
    @Column(name = "EO_status")
    private char status;
}