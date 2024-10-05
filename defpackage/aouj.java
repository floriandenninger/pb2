package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aouj extends aonm implements aooz {
    public static final aouj a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    private aota h;
    private byte i = 2;

    static {
        aouj aoujVar = new aouj();
        a = aoujVar;
        aonm.registerDefaultInstance(aouj.class, aoujVar);
    }

    private aouj() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aouj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aouj.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
