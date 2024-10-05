package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dne implements dng {
    private final /* synthetic */ int a;

    public dne(int i) {
        this.a = i;
    }

    @Override // defpackage.dng
    public final String b() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "y" : "x" : "width" : "scale" : "rotation" : "alpha" : "height";
    }

    @Override // defpackage.dng
    public final float e(dju djuVar) {
        int height;
        dik dikVar;
        dik dikVar2;
        dik dikVar3;
        int i = this.a;
        if (i == 0) {
            height = djuVar.c.height();
        } else {
            if (i == 1) {
                dik dikVar4 = djuVar.l;
                if (dikVar4 == null || !dikVar4.t() || (dikVar = djuVar.l) == null) {
                    return 1.0f;
                }
                return dikVar.f;
            }
            if (i == 2) {
                dik dikVar5 = djuVar.l;
                if (dikVar5 == null || !dikVar5.v() || (dikVar2 = djuVar.l) == null) {
                    return 0.0f;
                }
                return dikVar2.g;
            }
            if (i == 3) {
                dik dikVar6 = djuVar.l;
                if (dikVar6 == null || !dikVar6.y() || (dikVar3 = djuVar.l) == null) {
                    return 1.0f;
                }
                return dikVar3.e;
            }
            if (i == 4) {
                height = djuVar.c.width();
            } else if (i == 5) {
                height = djuVar.c.left;
            } else {
                height = djuVar.c.top;
            }
        }
        return height;
    }

    @Override // defpackage.dng
    public final void c(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                d(obj, 1.0f);
                return;
            }
            if (i == 2) {
                dnf.b(obj, this).setRotation(0.0f);
                return;
            }
            if (i == 3) {
                View b = dnf.b(obj, this);
                b.setScaleX(1.0f);
                b.setScaleY(1.0f);
            } else if (i != 4) {
                if (i != 5) {
                    if (obj instanceof View) {
                        ((View) obj).setTranslationY(0.0f);
                    }
                } else if (obj instanceof View) {
                    ((View) obj).setTranslationX(0.0f);
                }
            }
        }
    }

    @Override // defpackage.dng
    public final float a(Object obj) {
        int height;
        int width;
        int i = this.a;
        if (i == 0) {
            if (obj instanceof View) {
                height = ((View) obj).getHeight();
            } else if (obj instanceof Drawable) {
                height = ((Drawable) obj).getBounds().height();
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Getting height from unsupported mount content: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
            return height;
        }
        if (i == 1) {
            if (obj instanceof View) {
                return ((View) obj).getAlpha();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
            sb2.append("Tried to get alpha of unsupported mount content: ");
            sb2.append(valueOf2);
            throw new UnsupportedOperationException(sb2.toString());
        }
        if (i == 2) {
            return dnf.b(obj, this).getRotation();
        }
        if (i == 3) {
            View b = dnf.b(obj, this);
            float scaleX = b.getScaleX();
            if (scaleX == b.getScaleY()) {
                return scaleX;
            }
            throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
        }
        if (i == 4) {
            if (obj instanceof View) {
                width = ((View) obj).getWidth();
            } else if (obj instanceof Drawable) {
                width = ((Drawable) obj).getBounds().width();
            } else {
                String valueOf3 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                sb3.append("Getting width from unsupported mount content: ");
                sb3.append(valueOf3);
                throw new UnsupportedOperationException(sb3.toString());
            }
            return width;
        }
        if (i != 5) {
            if (obj instanceof dkp) {
                return ((dkp) obj).getY();
            }
            if (obj instanceof View) {
                return dnf.a((View) obj, false);
            }
            if (obj instanceof Drawable) {
                return r4.getBounds().top + dnf.a(dnf.c((Drawable) obj), false);
            }
            String valueOf4 = String.valueOf(obj);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 42);
            sb4.append("Getting Y from unsupported mount content: ");
            sb4.append(valueOf4);
            throw new UnsupportedOperationException(sb4.toString());
        }
        if (obj instanceof dkp) {
            return ((dkp) obj).getX();
        }
        if (obj instanceof View) {
            return dnf.a((View) obj, true);
        }
        if (obj instanceof Drawable) {
            return r4.getBounds().left + dnf.a(dnf.c((Drawable) obj), true);
        }
        String valueOf5 = String.valueOf(obj);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 42);
        sb5.append("Getting X from unsupported mount content: ");
        sb5.append(valueOf5);
        throw new UnsupportedOperationException(sb5.toString());
    }

    @Override // defpackage.dng
    public final void d(Object obj, float f) {
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) obj;
                if (componentHost instanceof dkp) {
                    dkp dkpVar = (dkp) componentHost;
                    dkpVar.x = (int) f;
                    dkpVar.requestLayout();
                } else {
                    int top = componentHost.getTop();
                    did.L(componentHost, componentHost.getLeft(), top, componentHost.getRight(), (int) (top + f), false);
                }
                List f2 = componentHost.f();
                if (f2 != null) {
                    int width = componentHost.getWidth();
                    int i3 = (int) f;
                    while (i2 < f2.size()) {
                        did.M((Drawable) f2.get(i2), width, i3);
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof View) {
                View view = (View) obj;
                int top2 = view.getTop();
                did.L(view, view.getLeft(), top2, view.getRight(), (int) (top2 + f), false);
                return;
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                did.M(drawable, drawable.getBounds().width(), (int) f);
                return;
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Setting height on unsupported mount content: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        if (i == 1) {
            if (obj instanceof View) {
                ((View) obj).setAlpha(f);
                return;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
            sb2.append("Setting alpha on unsupported mount content: ");
            sb2.append(valueOf2);
            throw new UnsupportedOperationException(sb2.toString());
        }
        if (i == 2) {
            dnf.b(obj, this).setRotation(f);
            return;
        }
        if (i == 3) {
            View b = dnf.b(obj, this);
            b.setScaleX(f);
            b.setScaleY(f);
            return;
        }
        if (i == 4) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost2 = (ComponentHost) obj;
                if (componentHost2 instanceof dkp) {
                    dkp dkpVar2 = (dkp) componentHost2;
                    dkpVar2.w = (int) f;
                    dkpVar2.requestLayout();
                } else {
                    int left = componentHost2.getLeft();
                    did.L(componentHost2, left, componentHost2.getTop(), (int) (left + f), componentHost2.getBottom(), false);
                }
                List f3 = componentHost2.f();
                if (f3 != null) {
                    int i4 = (int) f;
                    int height = componentHost2.getHeight();
                    while (i2 < f3.size()) {
                        did.M((Drawable) f3.get(i2), i4, height);
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof View) {
                View view2 = (View) obj;
                int left2 = view2.getLeft();
                did.L(view2, left2, view2.getTop(), (int) (left2 + f), view2.getBottom(), false);
                return;
            } else if (obj instanceof Drawable) {
                Drawable drawable2 = (Drawable) obj;
                did.M(drawable2, (int) f, drawable2.getBounds().height());
                return;
            } else {
                String valueOf3 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 44);
                sb3.append("Setting width on unsupported mount content: ");
                sb3.append(valueOf3);
                throw new UnsupportedOperationException(sb3.toString());
            }
        }
        if (i == 5) {
            if (obj instanceof dkp) {
                ((View) obj).setX(f);
                return;
            }
            if (obj instanceof View) {
                View view3 = (View) obj;
                view3.setX(f - dnf.a((View) view3.getParent(), true));
                return;
            } else if (obj instanceof Drawable) {
                Drawable drawable3 = (Drawable) obj;
                did.N(drawable3, (int) (f - dnf.a(dnf.c(drawable3), true)), drawable3.getBounds().top);
                return;
            } else {
                String valueOf4 = String.valueOf(obj);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
                sb4.append("Setting X on unsupported mount content: ");
                sb4.append(valueOf4);
                throw new UnsupportedOperationException(sb4.toString());
            }
        }
        if (obj instanceof dkp) {
            ((View) obj).setY(f);
            return;
        }
        if (obj instanceof View) {
            View view4 = (View) obj;
            view4.setY(f - dnf.a((View) view4.getParent(), false));
        } else if (obj instanceof Drawable) {
            Drawable drawable4 = (Drawable) obj;
            did.N(drawable4, drawable4.getBounds().left, (int) (f - dnf.a(dnf.c(drawable4), false)));
        } else {
            String valueOf5 = String.valueOf(obj);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 40);
            sb5.append("Setting Y on unsupported mount content: ");
            sb5.append(valueOf5);
            throw new UnsupportedOperationException(sb5.toString());
        }
    }
}
