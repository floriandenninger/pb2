package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aosb extends aonm implements aooz {
    public static final aosb a;
    private static volatile aopf i;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;

    static {
        aosb aosbVar = new aosb();
        a = aosbVar;
        aonm.registerDefaultInstance(aosb.class, aosbVar);
    }

    private aosb() {
        emptyIntList();
        this.e = "";
        this.g = "";
        this.h = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"b", "c", aorv.a(), "d", aorv.a(), "e", "f", aort.a(), "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aosb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aosb.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
