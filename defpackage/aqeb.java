package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqeb extends aonm implements aooz {
    public static final aqeb a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private aota g;
    private aulq h;
    private byte i = 2;

    static {
        aqeb aqebVar = new aqeb();
        a = aqebVar;
        aonm.registerDefaultInstance(aqeb.class, aqebVar);
    }

    private aqeb() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\nᐉ\b\fᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqeb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqeb.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
