package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkf {
    public String a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;

    public afkf(ywr ywrVar) {
        a((awvr) ywrVar.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(awvr awvrVar) {
        this.a = (awvrVar.b & 8) != 0 ? awvrVar.g : null;
        aoot aootVar = awvrVar.h;
        this.b = aootVar.containsKey("last_manual_video_quality_selection_max") ? ((Integer) aootVar.get("last_manual_video_quality_selection_max")).intValue() : -1;
        aoot aootVar2 = awvrVar.i;
        this.c = aootVar2.containsKey("last_manual_video_quality_selection_min") ? ((Integer) aootVar2.get("last_manual_video_quality_selection_min")).intValue() : -1;
        aoot aootVar3 = awvrVar.j;
        this.d = aootVar3.containsKey("last_manual_video_quality_selection_direction") ? ((Integer) aootVar3.get("last_manual_video_quality_selection_direction")).intValue() : -2;
        aoot aootVar4 = awvrVar.k;
        this.e = aootVar4.containsKey("last_manual_video_quality_selection_timestamp") ? ((Long) aootVar4.get("last_manual_video_quality_selection_timestamp")).longValue() : -1L;
        aoot aootVar5 = awvrVar.d;
        this.f = aootVar5.containsKey("last_playback_start_timestamp") ? ((Long) aootVar5.get("last_playback_start_timestamp")).longValue() : -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public afkf(ywr ywrVar, int i) {
        awvr awvrVar = (awvr) ywrVar.c();
        awvk awvkVar = awvrVar.u;
        awvkVar = awvkVar == null ? awvk.a : awvkVar;
        awvk awvkVar2 = awvrVar.t;
        awvkVar2 = awvkVar2 == null ? awvk.a : awvkVar2;
        if ((awvkVar.b & 1) != 0) {
            if (i != 1 || awvkVar.e >= awvkVar2.e) {
                this.e = awvkVar.e;
            } else {
                this.e = -1L;
                awvkVar = awvkVar2;
            }
            this.a = (awvrVar.b & 8) != 0 ? awvrVar.g : null;
            aoot aootVar = awvrVar.d;
            this.f = aootVar.containsKey("last_playback_start_timestamp") ? ((Long) aootVar.get("last_playback_start_timestamp")).longValue() : -1L;
            int i2 = awvkVar.b;
            int i3 = i2 & 1;
            this.b = i3 != 0 ? awvkVar.c : -1;
            this.c = i3 != 0 ? awvkVar.c : -1;
            this.d = (i2 & 2) != 0 ? awvkVar.d : -2;
            return;
        }
        a(awvrVar);
    }
}
