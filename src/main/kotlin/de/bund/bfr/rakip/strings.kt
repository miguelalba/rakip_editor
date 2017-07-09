package de.bund.bfr.rakip

import java.util.*

private var messages = ResourceBundle.getBundle("MessagesBundle", Locale.getDefault())!!

val REFERENCE_TYPE: String = messages.getString("GM.EditReferencePanel.typeLabel")
val REFERENCE_DATE: String = messages.getString("GM.EditReferencePanel.dateLabel")
val REFERENCE_DOI: String = messages.getString("GM.EditReferencePanel.doiLabel")
val REFERENCE_AUTHORLIST: String = messages.getString("GM.EditReferencePanel.authorListLabel")
val REFERENCE_TITLE: String = messages.getString("GM.EditReferencePanel.titleLabel")
val REFERENCE_ABSTRACT: String = messages.getString("GM.EditReferencePanel.abstractLabel")
val REFERENCE_JOURNAL: String = messages.getString("GM.EditReferencePanel.journalLabel")
val REFERENCE_VOLUME: String = messages.getString("GM.EditReferencePanel.volumeLabel")
val REFERENCE_ISSUE: String = messages.getString("GM.EditReferencePanel.issueLabel")
val REFERENCE_PAGE: String = messages.getString("GM.EditReferencePanel.pageLabel")
val REFERENCE_WEBSITE: String = messages.getString("GM.EditReferencePanel.websiteLabel")
val REFERENCE_PMID: String = messages.getString("GM.EditReferencePanel.pmidLabel")
val REFERENCE_STATUS: String = messages.getString("GM.EditReferencePanel.statusLabel")
val REFERENCE_COMMENT: String = messages.getString("GM.EditReferencePanel.commentLabel")

val CREATOR_GIVENNAME: String = messages.getString("GM.EditCreatorPanel.givenNameLabel")
val CREATOR_FAMILYNAME: String = messages.getString("GM.EditCreatorPanel.familyNameLabel")
val CREATOR_CONTACT: String = messages.getString("GM.EditCreatorPanel.contactLabel")

val PRODUCT_NAME: String = messages.getString("GM.EditProductPanel.envNameLabel")
val PRODUCT_NAME_TOOLTIP: String = messages.getString("GM.EditProductPanel.envNameTooltip")
val PRODUCT_DESC: String = messages.getString("GM.EditProductPanel.envDescriptionLabel")
val PRODUCT_DESC_TOOLTIP: String = messages.getString("GM.EditProductPanel.envDescriptionTooltip")
val PRODUCT_UNIT: String = messages.getString("GM.EditProductPanel.envUnitLabel")
val PRODUCT_UNIT_TOOLTIP: String = messages.getString("GM.EditProductPanel.envUnitTooltip")
val PRODUCT_PRODUCTIONMETHOD: String = messages.getString("GM.EditProductPanel.productionMethodLabel")
val PRODUCT_PRODUCTIONMETHOD_TOOLTIP: String = messages.getString("GM.EditProductPanel.productionMethodTooltip")
val PRODUCT_PACKAGING: String = messages.getString("GM.EditProductPanel.packagingLabel")
val PRODUCT_PACKAGING_TOOLTIP: String = messages.getString("GM.EditProductPanel.packagingTooltip")
val PRODUCT_TREATMENT: String = messages.getString("GM.EditProductPanel.productTreatmentLabel")
val PRODUCT_TREATMENT_TOOLTIP: String = messages.getString("GM.EditProductPanel.productTreatmentTooltip")
val PRODUCT_ORIGINCOUNTRY: String = messages.getString("GM.EditProductPanel.originCountryLabel")
val PRODUCT_ORIGINCOUNTRY_TOOLTIP: String = messages.getString("GM.EditProductPanel.originCountryTooltip")
val PRODUCT_ORIGINAREA: String = messages.getString("GM.EditProductPanel.originAreaLabel")
val PRODUCT_ORIGINAREA_TOOLTIP: String = messages.getString("GM.EditProductPanel.originAreaTooltip")
val PRODUCT_FISHERIES: String = messages.getString("GM.EditProductPanel.fisheriesAreaLabel")
val PRODUCT_FISHERIES_TOOLTIP: String = messages.getString("GM.EditProductPanel.fisheriesAreaTooltip")
val PRODUCT_PRODUCTIONDATE: String = messages.getString("GM.EditProductPanel.productionDateLabel")
val PRODUCT_PRODUCTIONDATE_TOOLTIP: String = messages.getString("GM.EditProductPanel.productionDateTooltip")
val PRODUCT_EXPIRATIONDATE: String = messages.getString("GM.EditProductPanel.expirationDateLabel")
val PRODUCT_EXPIRATIONDATE_TOOLTIP: String = messages.getString("GM.EditProductPanel.expirationDateTooltip")

val HAZARD_TYPE: String = messages.getString("GM.EditHazardPanel.hazardTypeLabel")
val HAZARD_TYPE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.hazardTypeTooltip")
val HAZARD_NAME: String = messages.getString("GM.EditHazardPanel.hazardNameLabel")
val HAZARD_NAME_TOOLTIP: String = messages.getString("GM.EditHazardPanel.hazardNameTooltip")
val HAZARD_DESCRIPTION: String = messages.getString("GM.EditHazardPanel.hazardDescriptionLabel")
val HAZARD_DESCRIPTION_TOOLTIP: String = messages.getString("GM.EditHazardPanel.hazardDescriptionTooltip")
val HAZARD_UNIT: String = messages.getString("GM.EditHazardPanel.hazardUnitLabel")
val HAZARD_UNIT_TOOLTIP: String = messages.getString("GM.EditHazardPanel.hazardUnitTooltip")
val HAZARD_ADVERSE: String = messages.getString("GM.EditHazardPanel.adverseEffectLabel")
val HAZARD_ADVERSE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.adverseEffectTooltip")
val HAZARD_ORIGIN: String = messages.getString("GM.EditHazardPanel.originLabel")
val HAZARD_ORIGIN_TOOLTIP: String = messages.getString("GM.EditHazardPanel.originTooltip")
val HAZARD_BMD: String = messages.getString("GM.EditHazardPanel.bmdLabel")
val HAZARD_BMD_TOOLTIP: String = messages.getString("GM.EditHazardPanel.bmdTooltip")
val HAZARD_RESIDUE: String = messages.getString("GM.EditHazardPanel.maxResidueLimitLabel")
val HAZARD_RESIDUE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.maxResidueLimitTooltip")
val HAZARD_NOADVERSE: String = messages.getString("GM.EditHazardPanel.noObservedAdverseLabel")
val HAZARD_NOADVERSE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.noObservedAdverseTooltip")
val HAZARD_LOWESTADVERSE: String = messages.getString("GM.EditHazardPanel.lowestObserveLabel")
val HAZARD_LOWESTADVERSE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.lowestObserveTooltip")
val HAZARD_ACCEPTABLEOPERATOR: String = messages.getString("GM.EditHazardPanel.acceptableOperatorLabel")
val HAZARD_ACCEPTABLEOPERATOR_TOOLTIP: String = messages.getString("GM.EditHazardPanel.acceptableOperatorTooltip")
val HAZARD_ACUTEDOSE: String = messages.getString("GM.EditHazardPanel.acuteReferenceDoseLabel")
val HAZARD_ACUTEDOSE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.acuteReferenceDoseTooltip")
val HAZARD_DAILYINTAKE: String = messages.getString("GM.EditHazardPanel.acceptableDailyIntakeLabel")
val HAZARD_DAILYINTAKE_TOOLTIP: String = messages.getString("GM.EditHazardPanel.acceptableDailyIntakeLabel")
val HAZARD_INDSUM: String = messages.getString("GM.EditHazardPanel.indSumLabel")
val HAZARD_INDSUM_TOOLTIP: String = messages.getString("GM.EditHazardPanel.indSumTooltip")
val HAZARD_LABNAME: String = messages.getString("GM.EditHazardPanel.labNameLabel")
val HAZARD_LABNAME_TOOLTIP: String = messages.getString("GM.EditHazardPanel.labNameTooltip")
val HAZARD_LABCOUNTRY: String = messages.getString("GM.EditHazardPanel.labCountryLabel")
val HAZARD_LABCOUNTRY_TOOLTIP: String = messages.getString("GM.EditHazardPanel.labCountryTooltip")
val HAZARD_DETECTIONLIM: String = messages.getString("GM.EditHazardPanel.detectionLimitLabel")
val HAZARD_DETECTIONLIM_TOOLTIP: String = messages.getString("GM.EditHazardPanel.detectionLimitTooltip")
val HAZARD_QUANTIFICATIONLIM: String = messages.getString("GM.EditHazardPanel.quantificationLimitLabel")
val HAZARD_QUANTIFICATIONLIM_TOOLTIP: String = messages.getString("GM.EditHazardPanel.quantificationLimitTooltip")
val HAZARD_CENSOREDDATA: String = messages.getString("GM.EditHazardPanel.leftCensoredDataLabel")
val HAZARD_CENSOREDDATA_TOOLTIP: String = messages.getString("GM.EditHazardPanel.leftCensoredDataTooltip")
val HAZARD_CONTAMINATION: String = messages.getString("GM.EditHazardPanel.contaminationRangeLabel")
val HAZARD_CONTAMINATION_TOOLTIP: String = messages.getString(("GM.EditHazardPanel.contaminationRangeTooltip"))

val PG_NAME: String = messages.getString("GM.EditPopulationGroupPanel.populationNameLabel")
val PG_NAME_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.populationNameTooltip")
val PG_TARGET: String = messages.getString("GM.EditPopulationGroupPanel.targetPopulationLabel")
val PG_TARGET_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.targetPopulationTooltip")
val PG_SPAN: String = messages.getString("GM.EditPopulationGroupPanel.populationSpanLabel")
val PG_SPAN_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.populationSpanTooltip")
val PG_DESC: String = messages.getString("GM.EditPopulationGroupPanel.populationDescriptionLabel")
val PG_DESC_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.populationDescriptionTooltip")
val PG_AGE: String = messages.getString("GM.EditPopulationGroupPanel.populationAgeLabel")
val PG_AGE_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.populationAgeTooltip")
val PG_GENDER: String = messages.getString("GM.EditPopulationGroupPanel.populationGenderLabel")
val PG_GENDER_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.populationGenderTooltip")
val PG_BMI: String = messages.getString("GM.EditPopulationGroupPanel.bmiLabel")
val PG_BMI_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.bmiTooltip")
val PG_DIETGROUPS: String = messages.getString("GM.EditPopulationGroupPanel.specialDietGroupsLabel")
val PG_DIETGROUPS_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.specialDietGroupsTooltip")
val PG_PATTERNCONSUMPTION: String = messages.getString(("GM.EditPopulationGroupPanel.patternConsumptionLabel"))
val PG_PATTERNCONSUMPTION_TOOLTIP: String = messages.getString(("GM.EditPopulationGroupPanel.patternConsumptionTooltip"))
val PG_REGION: String = messages.getString("GM.EditPopulationGroupPanel.regionLabel")
val PG_REGION_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.regionTooltip")
val PG_COUNTRY: String = messages.getString("GM.EditPopulationGroupPanel.countryLabel")
val PG_COUNTRY_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.countryTooltip")
val PG_RISK: String = messages.getString("GM.EditPopulationGroupPanel.riskAndPopulationLabel")
val PG_RISK_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.riskAndPopulationTooltip")
val PG_SEASON: String = messages.getString("GM.EditPopulationGroupPanel.seasonLabel")
val PG_SEASON_TOOLTIP: String = messages.getString("GM.EditPopulationGroupPanel.seasonTooltip")

val DB_STUDYSAMPLE: String = messages.getString("GM.DataBackgroundPanel.studySampleLabel")
val DB_DIETARYASSESSMENTMETHOD: String = messages.getString("GM.DataBackgroundPanel.dietaryAssessmentMethodLabel")
val DB_ACCREDITATION: String = messages.getString("GM.DataBackgroundPanel.laboratoryAccreditationLabel")
val DB_ASSAY: String = messages.getString("GM.DataBackgroundPanel.assayLabel")

val STUDY_TITLE: String = messages.getString("GM.StudyPanel.studyTitleLabel")
val STUDY_TITLE_TOOLTIP: String = messages.getString("GM.StudyPanel.studyTitleTooltip")
val STUDY_DESC: String = messages.getString("GM.StudyPanel.studyDescriptionLabel")
val STUDY_DESC_TOOLTIP: String = messages.getString("GM.StudyPanel.studyDescriptionTooltip")
val STUDY_DESIGN: String = messages.getString("GM.StudyPanel.studyDesignTypeLabel")
val STUDY_DESIGN_TOOLTIP: String = messages.getString("GM.StudyPanel.studyDesignTypeTooltip")
val STUDY_MEASUREMENT: String = messages.getString("GM.StudyPanel.studyAssayMeasurementsTypeLabel")
val STUDY_MEASUREMENT_TOOLTIP: String = messages.getString("GM.StudyPanel.studyAssayMeasurementsTypeTooltip")
val STUDY_TECH_TYPE: String = messages.getString("GM.StudyPanel.studyAssayTechnologyTypeLabel")
val STUDY_TECH_TYPE_TOOLTIP: String = messages.getString("GM.StudyPanel.studyAssayTechnologyTypeTooltip")
val STUDY_TECH_PLAT: String = messages.getString("GM.StudyPanel.studyAssayTechnologyPlatformLabel")
val STUDY_TECH_PLAT_TOOLTIP: String = messages.getString("GM.StudyPanel.studyAssayTechnologyPlatformTooltip")
val STUDY_ACCREDITATION: String = messages.getString("GM.StudyPanel.accreditationProcedureLabel")
val STUDY_ACCREDITATION_TOOLTIP: String = messages.getString("GM.StudyPanel.accreditationProcedureTooltip")
val STUDY_PROTOCOL_NAME: String = messages.getString("GM.StudyPanel.protocolNameLabel")
val STUDY_PROTOCOL_NAME_TOOLTIP: String = messages.getString("GM.StudyPanel.protocolNameTooltip")
val STUDY_PROTOCOL_TYPE: String = messages.getString("GM.StudyPanel.protocolTypeLabel")
val STUDY_PROTOCOL_TYPE_TOOLTIP: String = messages.getString("GM.StudyPanel.protocolTypeTooltip")
val STUDY_PROTOCOL_DESC: String = messages.getString("GM.StudyPanel.protocolDescriptionLabel")
val STUDY_PROTOCOL_DESC_TOOLTIP: String = messages.getString("GM.StudyPanel.protocolDescriptionTooltip")
val STUDY_PROTOCOL_URI: String = messages.getString("GM.StudyPanel.protocolURILabel")
val STUDY_PROTOCOL_URI_TOOLTIP: String = messages.getString("GM.StudyPanel.protocolURITooltip")
val STUDY_PROTOCOL_VERSION: String = messages.getString("GM.StudyPanel.protocolVersionLabel")
val STUDY_PROTOCOL_VERSION_TOOLTIP: String = messages.getString("GM.StudyPanel.protocolVersionTooltip")
val STUDY_PARAMETERS: String = messages.getString("GM.StudyPanel.parametersLabel")
val STUDY_PARAMETERS_TOOLTIP: String = messages.getString("GM.StudyPanel.parametersTooltip")
val STUDY_COMPONENTS_TYPE: String = messages.getString("GM.StudyPanel.componentsTypeLabel")
val STUDY_COMPONENTS_TYPE_TOOLTIP: String = messages.getString("GM.StudyPanel.componentsTypeTooltip")

val SS_SAMPLE: String = messages.getString("GM.EditStudySamplePanel.sampleNameLabel")
val SS_SAMPLE_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.sampleNameTooltip")
val SS_MOISTURE_PERC: String = messages.getString("GM.EditStudySamplePanel.moisturePercentageLabel")
val SS_MOISTURE_PERC_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.moisturePercentageTooltip")
val SS_FAT_PERC: String = messages.getString("GM.EditStudySamplePanel.fatPercentageLabel")
val SS_FAT_PERC_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.fatPercentageTooltip")
val SS_SAMPLE_PROTOCOL: String = messages.getString("GM.EditStudySamplePanel.sampleProtocolLabel")
val SS_SAMPLE_PROTOCOL_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.sampleProtocolTooltip")
val SS_SAMPLING_STRATEGY: String = messages.getString("GM.EditStudySamplePanel.samplingStrategyLabel")
val SS_SAMPLING_STRATEGY_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingStrategyTooltip")
val SS_SAMPLING_TYPE: String = messages.getString("GM.EditStudySamplePanel.samplingTypeLabel")
val SS_SAMPLING_TYPE_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingTypeTooltip")
val SS_SAMPLING_METHOD: String = messages.getString("GM.EditStudySamplePanel.samplingMethodLabel")
val SS_SAMPLING_METHOD_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingMethodTooltip")
val SS_SAMPLING_PLAN: String = messages.getString("GM.EditStudySamplePanel.samplingPlanLabel")
val SS_SAMPLING_PLAN_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingPlanTooltip")
val SS_SAMPLING_WEIGHT: String = messages.getString("GM.EditStudySamplePanel.samplingWeightLabel")
val SS_SAMPLING_WEIGHT_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingWeightTooltip")
val SS_SAMPLING_SIZE: String = messages.getString("GM.EditStudySamplePanel.samplingSizeLabel")
val SS_SAMPLING_SIZE_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingSizeTooltip")
val SS_LOT_UNIT: String = messages.getString("GM.EditStudySamplePanel.lotSizeUnitLabel")
val SS_LOT_UNIT_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.lotSizeUnitLabel")
val SS_SAMPLING_POINT: String = messages.getString("GM.EditStudySamplePanel.samplingPointLabel")
val SS_SAMPLING_POINT_TOOLTIP: String = messages.getString("GM.EditStudySamplePanel.samplingPointLabel")

val DAM_TOOL: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.dataCollectionToolLabel")
val DAM_TOOL_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.dataCollectionToolTooltip")
val DAM_NUMBER_NON_CONSECUTIVE: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.nonConsecutiveOneDaysLabel")
val DAM_NUMBER_NON_CONSECUTIVE_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.nonConsecutiveOneDaysTooltip")
val DAM_SOFTWARE: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.dietarySoftwareToolLabel")
val DAM_SOFTWARE_TOOLTIP = messages.getString("GM.EditDietaryAssessmentMethodPanel.dietarySoftwareToolTooltip")
val DAM_FOOD_ITEM: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.foodItemNumberLabel")
val DAM_FOOD_ITEM_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.foodItemNumberTooltip")
val DAM_NON_CONSECUTIVE: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.nonConsecutiveOneDaysLabel")
val DAM_NON_CONSECUTIVE_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.nonConsecutiveOneDaysTooltip")
val DAM_RECORD_TYPE: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.recordTypeLabel")
val DAM_RECORD_TYPE_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.recordTypeTooltip")
val DAM_FOOD_DESC: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.foodDescriptionLabel")
val DAM_FOOD_DESC_TOOLTIP: String = messages.getString("GM.EditDietaryAssessmentMethodPanel.foodDescriptionTooltip")

val ASSAY_NAME: String = messages.getString("GM.EditAssayPanel.nameLabel")
val ASSAY_NAME_TOOLTIP: String = messages.getString("GM.EditAssayPanel.nameTooltip")
val ASSAY_DESC: String = messages.getString("GM.EditAssayPanel.descriptionLabel")
val ASSAY_DESC_TOOLTIP: String = messages.getString("GM.EditAssayPanel.descriptionTooltip")

val GI_STUDY_NAME: String = messages.getString("GM.GeneralInformationPanel.studyNameLabel")
val GI_STUDY_NAME_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.studyNameTooltip")
val GI_ID: String = messages.getString("GM.GeneralInformationPanel.identifierLabel")
val GI_ID_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.identifierTooltip")
val GI_CREATION_DATE: String = messages.getString("GM.GeneralInformationPanel.creationDateLabel")
val GI_CREATION_DATE_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.creationDateTooltip")
val GI_RIGHTS: String = messages.getString("GM.GeneralInformationPanel.rightsLabel")
val GI_RIGHTS_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.rightsTooltip")
val GI_URL: String = messages.getString("GM.GeneralInformationPanel.urlLabel")
val GI_URL_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.urlTooltip")
val GI_FORMAT: String = messages.getString("GM.GeneralInformationPanel.formatLabel")
val GI_FORMAT_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.formatTooltip")
val GI_LANGUAGE: String = messages.getString("GM.GeneralInformationPanel.languageLabel")
val GI_LANGUAGE_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.languageTooltip")
val GI_SOFTWARE: String = messages.getString("GM.GeneralInformationPanel.softwareLabel")
val GI_SOFTWARE_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.softwareTooltip")
val GI_LANGUAGE_WRITTEN_IN: String = messages.getString("GM.GeneralInformationPanel.languageWrittenInLabel")
val GI_LANGUAGE_WRITTEN_IN_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.languageWrittenInTooltip")
val GI_STATUS: String = messages.getString("GM.GeneralInformationPanel.statusLabel")
val GI_STATUS_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.statusTooltip")
val GI_OBJECTIVE: String = messages.getString("GM.GeneralInformationPanel.objectiveLabel")
val GI_OBJECTIVE_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.objectiveTooltip")
val GI_DESC: String = messages.getString("GM.GeneralInformationPanel.descriptionLabel")
val GI_DESC_TOOLTIP: String = messages.getString("GM.GeneralInformationPanel.descriptionTooltip")

val SCOPE_PRODUCT: String = messages.getString("GM.ScopePanel.productLabel")
val SCOPE_HAZARD: String = messages.getString("GM.ScopePanel.hazardLabel")
val SCOPE_COMMENT: String = messages.getString("GM.ScopePanel.commentLabel")
val SCOPE_COMMENT_TOOLTIP: String = messages.getString("GM.ScopePanel.commentTooltip")
val SCOPE_TEMPORAL: String = messages.getString("GM.ScopePanel.temporalInformationLabel")
val SCOPE_TEMPORAL_TOOLTIP: String = messages.getString("GM.ScopePanel.temporalInformationTooltip")
val SCOPE_REGION: String = messages.getString("GM.ScopePanel.regionLabel")
val SCOPE_REGION_TOOLTIP: String = messages.getString("GM.ScopePanel.regionTooltip")
val SCOPE_COUNTRY: String = messages.getString("GM.ScopePanel.countryLabel")
val SCOPE_COUNTRY_TOOLTIP: String = messages.getString("GM.ScopePanel.countryTooltip")

val PARAMETER_ID: String = messages.getString("GM.EditParameterPanel.idLabel")
val PARAMETER_ID_TOOLTIP: String = messages.getString("GM.EditParameterPanel.idTooltip")
val PARAMETER_CLASIF: String = messages.getString("GM.EditParameterPanel.classificationLabel")
val PARAMETER_CLASIF_TOOLTIP: String = messages.getString("GM.EditParameterPanel.classificationTooltip")
val PARAMETER_NAME: String = messages.getString("GM.EditParameterPanel.parameterNameLabel")
val PARAMETER_NAME_TOOLTIP: String = messages.getString("GM.EditParameterPanel.parameterNameTooltip")
val PARAMETER_DESC: String = messages.getString("GM.EditParameterPanel.descriptionLabel")
val PARAMETER_DESC_TOOLTIP: String = messages.getString("GM.EditParameterPanel.descriptionTooltip")
val PARAMETER_TYPE: String = messages.getString("GM.EditParameterPanel.typeLabel")
val PARAMETER_TYPE_TOOLTIP: String = messages.getString("GM.EditParameterPanel.typeTooltip")
val PARAMETER_UNIT: String = messages.getString("GM.EditParameterPanel.unitLabel")
val PARAMETER_UNIT_TOOLTIP: String = messages.getString("GM.EditParameterPanel.unitTooltip")
val PARAMETER_UNIT_CATEGORY: String = messages.getString("GM.EditParameterPanel.unitCategoryLabel")
val PARAMETER_UNIT_CATEGORY_TOOLTIP: String = messages.getString("GM.EditParameterPanel.unitCategoryTooltip")
val PARAMETER_DATA_TYPE: String = messages.getString("GM.EditParameterPanel.dataTypeLabel")
val PARAMETER_DATA_TYPE_TOOLTIP: String = messages.getString("GM.EditParameterPanel.dataTypeTooltip")
val PARAMETER_SOURCE: String = messages.getString("GM.EditParameterPanel.sourceLabel")
val PARAMETER_SOURCE_TOOLTIP: String = messages.getString("GM.EditParameterPanel.sourceTooltip")
val PARAMETER_SUBJECT: String = messages.getString("GM.EditParameterPanel.subjectLabel")
val PARAMETER_SUBJECT_TOOLTIP: String = messages.getString("GM.EditParameterPanel.subjectTooltip")
val PARAMETER_DIST: String = messages.getString("GM.EditParameterPanel.distributionLabel")
val PARAMETER_DIST_TOOLTIP: String = messages.getString("GM.EditParameterPanel.distributionTooltip")
val PARAMETER_VALUE: String = messages.getString("GM.EditParameterPanel.valueLabel")
val PARAMETER_VALUE_TOOLTIP: String = messages.getString("GM.EditParameterPanel.valueTooltip")
val PARAMETER_REFERENCE: String = messages.getString("GM.EditParameterPanel.referenceLabel")
val PARAMETER_REFERENCE_TOOLTIP: String = messages.getString("GM.EditParameterPanel.referenceTooltip")
val PARAMETER_VARIABILITY: String = messages.getString("GM.EditParameterPanel.variabilitySubjectLabel")
val PARAMETER_VARIABILITY_TOOLTIP: String = messages.getString("GM.EditParameterPanel.variabilitySubjectTooltip")
val PARAMETER_APPLICABILITY: String = messages.getString("GM.EditParameterPanel.applicabilityLabel")
val PARAMETER_APPLICABILITY_TOOLTIP: String = messages.getString("GM.EditParameterPanel.applicabilityTooltip")
val PARAMETER_ERROR: String = messages.getString("GM.EditParameterPanel.errorLabel")
val PARAMETER_ERROR_TOOLTIP: String = messages.getString("GM.EditParameterPanel.errorTooltip")

val MODEL_EQUATION_NAME: String = messages.getString("GM.EditModelEquationPanel.nameLabel")
val MODEL_EQUATION_NAME_TOOLTIP: String = messages.getString("GM.EditModelEquationPanel.nameTooltip")
val MODEL_EQUATION_CLASS: String = messages.getString("GM.EditModelEquationPanel.classLabel")
val MODEL_EQUATION_CLASS_TOOLTIP: String = messages.getString("GM.EditModelEquationPanel.classTooltip")
val MODEL_EQUATION_SCRIPT: String = messages.getString("GM.EditModelEquationPanel.scriptLabel")
val MODEL_EQUATION_SCRIPT_TOOLTIP: String = messages.getString("GM.EditModelEquationPanel.scriptTooltip")