package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurd implements aala {
    public static final aalb a = new aurc();
    private final aure b;

    public aurd(aure aureVar) {
        this.b = aureVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aurb(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aurd) && this.b.equals(((aurd) obj).b);
    }

    public String getExternalVideoId() {
        return this.b.d;
    }

    public String getNowPlayingEntityValue() {
        return this.b.f;
    }

    public aurg getSfvAudioItemPlaybackState() {
        aurg b = aurg.b(this.b.e);
        return b == null ? aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN : b;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("SfvAudioItemCurrentlyPlayingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
