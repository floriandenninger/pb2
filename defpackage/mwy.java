package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mwy implements ajol {
    private final ajok a;
    private final /* synthetic */ int b;

    public mwy(ajok ajokVar, int i) {
        this.b = i;
        this.a = ajokVar;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        if (this.b == 0) {
            ajokVar.f("is_drawer_context", true);
            ajokVar.f("avatar_selection_listener", this.a.c("avatar_selection_listener"));
            ajokVar.f("avatar_selection_controller", this.a.c("avatar_selection_controller"));
        } else {
            ajokVar.f("is_drawer_context", true);
            ajokVar.f("avatar_selection_listener", this.a.c("avatar_selection_listener"));
            ajokVar.f("avatar_selection_controller", this.a.c("avatar_selection_controller"));
            ajokVar.f("SECTION_LIST_DRAWER_COMPACT_MODE", Boolean.valueOf(this.a.j("SECTION_LIST_DRAWER_COMPACT_MODE", true)));
        }
    }
}
