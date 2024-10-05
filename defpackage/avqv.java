package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqv extends aonm implements aooz {
    public static final avqv a;
    private static volatile aopf b;
    private int c;
    private avqz d;
    private atly e;
    private avqz f;
    private atly g;
    private atly h;
    private atly i;
    private aota j;
    private byte k = 2;

    static {
        avqv avqvVar = new avqv();
        a = avqvVar;
        aonm.registerDefaultInstance(avqv.class, avqvVar);
    }

    private avqv() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\tᐉ\b\nᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "i", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avqv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avqv.class) {
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
