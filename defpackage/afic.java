package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum afic {
    ABR("YT.abr"),
    CACHE("YT.mediacache"),
    CLOUD_PLAYER("YT.cloudplayer"),
    DRM("YT.drm"),
    EXO("YT.exo"),
    FWP("YT.fwp"),
    HDR("YT.hdr"),
    MFL("YT.mfl"),
    MEDIAFETCH("YT.mediafetch"),
    MLPLAYER("YT.mlplayer"),
    CODEC_REUSE("YT.codecreuse"),
    NET("YT.medianet"),
    QOE("YT.qoe"),
    ONESIE("YT.onesie"),
    PO("YT.po");

    public final String p;

    afic(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
