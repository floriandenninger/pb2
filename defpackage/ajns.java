package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajns implements ajol {
    private final int a;
    private final int b;

    public ajns(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f("grid_row_presenter_horizontal_row_padding", Integer.valueOf(this.a));
        if (i == 0) {
            ajokVar.f("grid_row_presenter_top_padding", Integer.valueOf(this.b));
            i = 0;
        }
        if (i == ajngVar.a() - 1) {
            ajokVar.f("grid_row_presenter_bottom_padding", Integer.valueOf(this.b));
        }
    }
}
