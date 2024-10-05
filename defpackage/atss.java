package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atss extends aonm implements aooz {
    public static final atss a;
    private static volatile aopf g;
    public int b;
    public atst c;
    public atsv d;
    public atsu e;
    public atsx f;
    private byte h = 2;

    static {
        atss atssVar = new atss();
        a = atssVar;
        aonm.registerDefaultInstance(atss.class, atssVar);
    }

    private atss() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf067│\ueec5㓷\u0004\u0000\u0000\u0004\uf067│ᐉ\u0001\ue621┌ᐉ\u0000\ueaae┢ᐉ\u0003\ueec5㓷ᐉ\u0002", new Object[]{"b", "d", "c", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atss();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atss.class) {
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
