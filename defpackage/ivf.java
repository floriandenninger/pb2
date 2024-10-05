package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ivf {
    public final amru a;
    public final int b;
    public final byte[] c;
    public final BrowseResponseModel d;
    public final CharSequence e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final ActionBarColor i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final ActionBarColor l;
    public final ActionBarColor m;
    public final boolean n;
    public final apxf o;
    public final Optional p;
    public final ajxe q;
    public final ajxe r;
    public final ajxe s;
    public final amru t;
    public final amru u;

    public ivf(amru amruVar, int i, byte[] bArr, BrowseResponseModel browseResponseModel, CharSequence charSequence, boolean z, boolean z2, long j, ActionBarColor actionBarColor, ActionBarColor actionBarColor2, ActionBarColor actionBarColor3, ActionBarColor actionBarColor4, ActionBarColor actionBarColor5, boolean z3, apxf apxfVar, Optional optional, ajxe ajxeVar, ajxe ajxeVar2, ajxe ajxeVar3, amru amruVar2, amru amruVar3) {
        if (amruVar == null) {
            throw new NullPointerException("Null tabsAndSectionListControllerStates");
        }
        this.a = amruVar;
        this.b = i;
        if (bArr != null) {
            this.c = bArr;
            this.d = browseResponseModel;
            this.e = charSequence;
            this.f = z;
            this.g = z2;
            this.h = j;
            this.i = actionBarColor;
            this.j = actionBarColor2;
            this.k = actionBarColor3;
            this.l = actionBarColor4;
            this.m = actionBarColor5;
            this.n = z3;
            if (apxfVar != null) {
                this.o = apxfVar;
                if (optional != null) {
                    this.p = optional;
                    this.q = ajxeVar;
                    this.r = ajxeVar2;
                    this.s = ajxeVar3;
                    if (amruVar2 != null) {
                        this.t = amruVar2;
                        if (amruVar3 != null) {
                            this.u = amruVar3;
                            return;
                        }
                        throw new NullPointerException("Null engagementPanelRenderers");
                    }
                    throw new NullPointerException("Null homeAdsPanelRenderers");
                }
                throw new NullPointerException("Null viewScrolledBeyondThresholdCommand");
            }
            throw new NullPointerException("Null backgroundResponseReceivedCommand");
        }
        throw new NullPointerException("Null responseTrackingParams");
    }

    public final boolean equals(Object obj) {
        BrowseResponseModel browseResponseModel;
        CharSequence charSequence;
        ActionBarColor actionBarColor;
        ActionBarColor actionBarColor2;
        ActionBarColor actionBarColor3;
        ActionBarColor actionBarColor4;
        ActionBarColor actionBarColor5;
        ajxe ajxeVar;
        ajxe ajxeVar2;
        ajxe ajxeVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ivf) {
            ivf ivfVar = (ivf) obj;
            if (amkq.aV(this.a, ivfVar.a) && this.b == ivfVar.b) {
                if (Arrays.equals(this.c, ivfVar instanceof ivf ? ivfVar.c : ivfVar.c) && ((browseResponseModel = this.d) != null ? browseResponseModel.equals(ivfVar.d) : ivfVar.d == null) && ((charSequence = this.e) != null ? charSequence.equals(ivfVar.e) : ivfVar.e == null) && this.f == ivfVar.f && this.g == ivfVar.g && this.h == ivfVar.h && ((actionBarColor = this.i) != null ? actionBarColor.equals(ivfVar.i) : ivfVar.i == null) && ((actionBarColor2 = this.j) != null ? actionBarColor2.equals(ivfVar.j) : ivfVar.j == null) && ((actionBarColor3 = this.k) != null ? actionBarColor3.equals(ivfVar.k) : ivfVar.k == null) && ((actionBarColor4 = this.l) != null ? actionBarColor4.equals(ivfVar.l) : ivfVar.l == null) && ((actionBarColor5 = this.m) != null ? actionBarColor5.equals(ivfVar.m) : ivfVar.m == null) && this.n == ivfVar.n && this.o.equals(ivfVar.o) && this.p.equals(ivfVar.p) && ((ajxeVar = this.q) != null ? ajxeVar.equals(ivfVar.q) : ivfVar.q == null) && ((ajxeVar2 = this.r) != null ? ajxeVar2.equals(ivfVar.r) : ivfVar.r == null) && ((ajxeVar3 = this.s) != null ? ajxeVar3.equals(ivfVar.s) : ivfVar.s == null) && amkq.aV(this.t, ivfVar.t) && amkq.aV(this.u, ivfVar.u)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003;
        BrowseResponseModel browseResponseModel = this.d;
        int hashCode2 = (hashCode ^ (browseResponseModel == null ? 0 : browseResponseModel.hashCode())) * 1000003;
        CharSequence charSequence = this.e;
        int hashCode3 = (((hashCode2 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        int i = true != this.g ? 1237 : 1231;
        long j = this.h;
        int i2 = (((hashCode3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ActionBarColor actionBarColor = this.i;
        int hashCode4 = (i2 ^ (actionBarColor == null ? 0 : actionBarColor.hashCode())) * 1000003;
        ActionBarColor actionBarColor2 = this.j;
        int hashCode5 = (hashCode4 ^ (actionBarColor2 == null ? 0 : actionBarColor2.hashCode())) * 1000003;
        ActionBarColor actionBarColor3 = this.k;
        int hashCode6 = (hashCode5 ^ (actionBarColor3 == null ? 0 : actionBarColor3.hashCode())) * 1000003;
        ActionBarColor actionBarColor4 = this.l;
        int hashCode7 = (hashCode6 ^ (actionBarColor4 == null ? 0 : actionBarColor4.hashCode())) * 1000003;
        ActionBarColor actionBarColor5 = this.m;
        int hashCode8 = (((((((hashCode7 ^ (actionBarColor5 == null ? 0 : actionBarColor5.hashCode())) * 1000003) ^ (true == this.n ? 1231 : 1237)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003;
        ajxe ajxeVar = this.q;
        int hashCode9 = (hashCode8 ^ (ajxeVar == null ? 0 : ajxeVar.hashCode())) * 1000003;
        ajxe ajxeVar2 = this.r;
        int hashCode10 = (hashCode9 ^ (ajxeVar2 == null ? 0 : ajxeVar2.hashCode())) * 1000003;
        ajxe ajxeVar3 = this.s;
        return ((((hashCode10 ^ (ajxeVar3 != null ? ajxeVar3.hashCode() : 0)) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String arrays = Arrays.toString(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        long j = this.h;
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        boolean z3 = this.n;
        String valueOf9 = String.valueOf(this.o);
        String valueOf10 = String.valueOf(this.p);
        String valueOf11 = String.valueOf(this.q);
        String valueOf12 = String.valueOf(this.r);
        String valueOf13 = String.valueOf(this.s);
        String valueOf14 = String.valueOf(this.t);
        String valueOf15 = String.valueOf(this.u);
        int length = "null".length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(arrays).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        int length11 = String.valueOf(valueOf9).length();
        int length12 = String.valueOf(valueOf10).length();
        int length13 = String.valueOf(valueOf11).length();
        int length14 = String.valueOf(valueOf12).length();
        int length15 = String.valueOf(valueOf13).length();
        int length16 = String.valueOf(valueOf14).length();
        StringBuilder sb = new StringBuilder(length + 597 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + String.valueOf(valueOf15).length());
        sb.append("RetainedState{superState=");
        sb.append("null");
        sb.append(", tabsAndSectionListControllerStates=");
        sb.append(valueOf);
        sb.append(", lastSelectedTabIndex=");
        sb.append(i);
        sb.append(", responseTrackingParams=");
        sb.append(arrays);
        sb.append(", browseResponseModel=");
        sb.append(valueOf2);
        sb.append(", title=");
        sb.append(valueOf3);
        sb.append(", enableTranslucentActionBar=");
        sb.append(z);
        sb.append(", hideTitleOnTranslucentHeader=");
        sb.append(z2);
        sb.append(", responseExpiryElapsedTimeMillis=");
        sb.append(j);
        sb.append(", backgroundColor=");
        sb.append(valueOf4);
        sb.append(", statusBarColor=");
        sb.append(valueOf5);
        sb.append(", primaryTextColor=");
        sb.append(valueOf6);
        sb.append(", secondaryTextColor=");
        sb.append(valueOf7);
        sb.append(", iconTintColor=");
        sb.append(valueOf8);
        sb.append(", restrictedModeEnabled=");
        sb.append(z3);
        sb.append(", backgroundResponseReceivedCommand=");
        sb.append(valueOf9);
        sb.append(", viewScrolledBeyondThresholdCommand=");
        sb.append(valueOf10);
        sb.append(", libraryLinksTransientState=");
        sb.append(valueOf11);
        sb.append(", feedFilterBarState=");
        sb.append(valueOf12);
        sb.append(", mySubsFeedFilterBarState=");
        sb.append(valueOf13);
        sb.append(", homeAdsPanelRenderers=");
        sb.append(valueOf14);
        sb.append(", engagementPanelRenderers=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }

    protected ivf() {
    }
}
