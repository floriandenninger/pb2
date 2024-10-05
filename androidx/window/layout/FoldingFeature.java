package androidx.window.layout;

import defpackage.azuj;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface FoldingFeature extends DisplayFeature {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class OcclusionType {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final OcclusionType NONE = new OcclusionType("NONE");
        public static final OcclusionType FULL = new OcclusionType("FULL");

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azuj azujVar) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Orientation {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azuj azujVar) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class State {
        public static final Companion Companion = new Companion(null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(azuj azujVar) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    OcclusionType getOcclusionType();

    Orientation getOrientation();

    State getState();

    boolean isSeparating();
}
