package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awan extends aonm implements aooz {
    public static final awan a;
    private static volatile aopf i;
    public int b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;
    public int g;
    public float h;

    static {
        awan awanVar = new awan();
        a = awanVar;
        aonm.registerDefaultInstance(awan.class, awanVar);
    }

    private awan() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0004ခ\u0001\u0005ခ\u0002\u0007ဇ\u0003\u000bဌ\u0007\fခ\b", new Object[]{"b", "c", "d", "e", "f", "g", avya.n, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awan();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awan.class) {
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
