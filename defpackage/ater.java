package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ater extends aonm implements aooz {
    public static final ater a;
    private static volatile aopf i;
    public int b;
    public ateo c;
    public ateo d;
    public atet e;
    public ateo f;
    public aqyg g;
    public ateo h;
    private ateq j;
    private ateo k;
    private aulq l;
    private byte m = 2;

    static {
        ater aterVar = new ater();
        a = aterVar;
        aonm.registerDefaultInstance(ater.class, aterVar);
    }

    private ater() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "j", "c", "k", "d", "e", "f", "l", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ater();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ater.class) {
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
