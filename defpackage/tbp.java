package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum tbp {
    COMPONENT_MATERIALIZATION("ComponentMaterialization"),
    TEMPLATE_FETCHING("TemplateFetching"),
    TEMPLATE_RESOLUTION("TemplateResolution"),
    PB_TO_FB("PbToFb"),
    FIRST_ROOT_PREPARATION("FirstRootPreparation"),
    FIRST_ROOT_MATERIALIZATION("FirstRootMaterialization"),
    FIRST_ROOT_MEASUREMENT("FirstRootMeasurement"),
    ROOT_MOUNTING("RootMounting"),
    COMMAND_EXECUTION("CommandExecution"),
    NATIVE_LIBRARY_LOAD("NativeLibLoading"),
    NATIVE_LIBRARY_CHECK("NativeLibChecking"),
    UNKNOWN("Unknown");

    public final String m;

    tbp(String str) {
        this.m = str;
    }
}
