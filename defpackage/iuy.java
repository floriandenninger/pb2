package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iuy {
    private apxf a;
    private BrowseResponseModel b;
    private Boolean c;
    private Boolean d;
    private Boolean e;

    public final iuz a() {
        BrowseResponseModel browseResponseModel;
        Boolean bool;
        apxf apxfVar = this.a;
        if (apxfVar == null || (browseResponseModel = this.b) == null || (bool = this.c) == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" endpoint");
            }
            if (this.b == null) {
                sb.append(" browseResponseModel");
            }
            if (this.c == null) {
                sb.append(" isLoggingEnabled");
            }
            if (this.d == null) {
                sb.append(" isNewResponseNeeded");
            }
            if (this.e == null) {
                sb.append(" isLoadingResponse");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new iuz(apxfVar, browseResponseModel, bool.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
    }

    public final void b(BrowseResponseModel browseResponseModel) {
        if (browseResponseModel == null) {
            throw new NullPointerException("Null browseResponseModel");
        }
        this.b = browseResponseModel;
    }

    public final void c(apxf apxfVar) {
        if (apxfVar == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.a = apxfVar;
    }

    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final hxn g() {
        BrowseResponseModel browseResponseModel;
        Boolean bool;
        apxf apxfVar = this.a;
        if (apxfVar == null || (browseResponseModel = this.b) == null || (bool = this.c) == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" endpoint");
            }
            if (this.b == null) {
                sb.append(" browseResponseModel");
            }
            if (this.c == null) {
                sb.append(" isLoggingEnabled");
            }
            if (this.d == null) {
                sb.append(" isNewResponseNeeded");
            }
            if (this.e == null) {
                sb.append(" isLoadingResponse");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hxn(apxfVar, browseResponseModel, bool.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
    }

    public final void h(BrowseResponseModel browseResponseModel) {
        if (browseResponseModel == null) {
            throw new NullPointerException("Null browseResponseModel");
        }
        this.b = browseResponseModel;
    }

    public final void i(apxf apxfVar) {
        if (apxfVar == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.a = apxfVar;
    }

    public final void j(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void k(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void l(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
