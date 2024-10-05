package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auig extends aonm implements aooz {
    public static final auig a;
    private static volatile aopf j;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public aqyg g;
    public atdf h;
    private aqyg k;
    private aota l;
    private byte m = 2;
    public aomf i = aomf.b;

    static {
        auig auigVar = new auig();
        a = auigVar;
        aonm.registerDefaultInstance(auig.class, auigVar);
    }

    private auig() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0007\u0005ည\b\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "l", "i", "f", "k", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auig();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auig.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
