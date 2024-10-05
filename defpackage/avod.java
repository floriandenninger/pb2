package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avod extends aonm implements aooz {
    public static final avod a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apjt f;
    private apxf g;
    private atdf h;
    private aota i;
    private byte j = 2;

    static {
        avod avodVar = new avod();
        a = avodVar;
        aonm.registerDefaultInstance(avod.class, avodVar);
    }

    private avod() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0007\bᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avod();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avod.class) {
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
