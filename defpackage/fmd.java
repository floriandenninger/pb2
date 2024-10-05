package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmd implements ayrs {
    private final aok a;
    private Optional b = Optional.empty();
    private final aivz c;

    public fmd(aok aokVar, aivz aivzVar) {
        this.c = aivzVar;
        this.a = aokVar;
    }

    @Override // defpackage.ayrs
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if (this.b.isPresent()) {
                return;
            }
            this.b = Optional.of(this.c.b(this.a.getLifecycle()));
            return;
        }
        b();
    }

    public final void b() {
        this.b.ifPresent(gfd.b);
        this.b = Optional.empty();
    }
}
