package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardu extends aonm implements aooz {
    public static final ardu a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public arfs e;
    public aots f;
    private aota h;
    public int c = 0;
    private byte i = 2;

    static {
        ardu arduVar = new ardu();
        a = arduVar;
        aonm.registerDefaultInstance(ardu.class, arduVar);
    }

    private ardu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"d", "c", "b", "e", apxf.class, apxf.class, "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ardu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ardu.class) {
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
