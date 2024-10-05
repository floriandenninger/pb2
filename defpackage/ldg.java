package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldg implements ajol {
    public static final /* synthetic */ ldg a = new ldg(3);
    private final /* synthetic */ int b;

    public ldg(int i) {
        this.b = i;
    }

    public static boolean b(ajok ajokVar) {
        return ajokVar.j("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", false);
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ajokVar.f("clarify_box_in_metadata_highlights", Boolean.TRUE);
            return;
        }
        if (i2 == 1) {
            ajokVar.f("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", true);
            return;
        }
        if (i2 == 2) {
            ajokVar.f("clarify_box_no_bottom", Boolean.TRUE);
            return;
        }
        if (i2 == 3) {
            if (ajngVar.c(i) instanceof ajul) {
                etx.n(ajokVar, 2);
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    ajokVar.f("isLastItem", Boolean.valueOf(i == ajngVar.a() + (-1)));
                    return;
                } else {
                    ajokVar.f("isFirstItem", Boolean.valueOf(i == 0));
                    return;
                }
            }
            if (i == ajngVar.a() - 1 && (ajngVar.c(i) instanceof awal)) {
                ajokVar.f("video_with_context_hide_separator_present_context_decorator", true);
            }
        }
    }
}
