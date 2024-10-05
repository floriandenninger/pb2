package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlw extends aonm implements aooz {
    public static final arlw a;
    private static volatile aopf e;
    public arnd b;
    public aulp c;
    private int f;
    private aota g;
    private aqzg h;
    private byte i = 2;
    public aomf d = aomf.b;

    static {
        arlw arlwVar = new arlw();
        a = arlwVar;
        aonm.registerDefaultInstance(arlw.class, arlwVar);
    }

    private arlw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004̉ᐉ\u0005", new Object[]{"f", "b", "c", "g", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arlw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arlw.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
