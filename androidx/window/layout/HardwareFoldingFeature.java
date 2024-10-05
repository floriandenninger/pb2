package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import defpackage.azuj;
import defpackage.azul;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion(null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azuj azujVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            bounds.getClass();
            if (bounds.getWidth() != 0 || bounds.getHeight() != 0) {
                if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Type {
        public static final Companion Companion = new Companion(null);
        private static final Type FOLD = new Type("FOLD");
        private static final Type HINGE = new Type("HINGE");
        private final String description;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azuj azujVar) {
                this();
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(Bounds bounds, Type type, FoldingFeature.State state) {
        bounds.getClass();
        type.getClass();
        state.getClass();
        this.featureBounds = bounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!azul.c(getClass(), obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
            return azul.c(this.featureBounds, hardwareFoldingFeature.featureBounds) && azul.c(this.type, hardwareFoldingFeature.type) && azul.c(getState(), hardwareFoldingFeature.getState());
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.DisplayFeature
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.OcclusionType getOcclusionType() {
        return (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) ? FoldingFeature.OcclusionType.NONE : FoldingFeature.OcclusionType.FULL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.Orientation getOrientation() {
        return this.featureBounds.getWidth() > this.featureBounds.getHeight() ? FoldingFeature.Orientation.HORIZONTAL : FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        if (azul.c(this.type, Type.Companion.getHINGE())) {
            return true;
        }
        return azul.c(this.type, Type.Companion.getFOLD()) && azul.c(getState(), FoldingFeature.State.HALF_OPENED);
    }

    public String toString() {
        return ((Object) "HardwareFoldingFeature") + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
