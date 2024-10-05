package com.google.android.libraries.youtube.player.subtitles.model;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_SubtitleTrack extends SubtitleTrack {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final int g;
    private final String h;
    private final boolean i;
    private final String j;
    private final CharSequence k;
    private final boolean l;

    public AutoValue_SubtitleTrack(String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6, String str7, String str8, CharSequence charSequence, boolean z2) {
        this.a = str;
        this.e = str2;
        this.f = str3;
        this.b = str4;
        this.g = i;
        this.h = str5;
        this.i = z;
        this.c = str6;
        this.d = str7;
        this.j = str8;
        this.k = charSequence;
        this.l = z2;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    @Deprecated
    public final int a() {
        return this.g;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final CharSequence b() {
        return this.k;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    @Deprecated
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String e() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String f() {
        return this.h;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    @Deprecated
    public final String g() {
        return this.f;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String h() {
        return this.j;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String i() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final String j() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final boolean k() {
        return this.i;
    }

    @Override // com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack
    public final boolean l() {
        return this.l;
    }
}
