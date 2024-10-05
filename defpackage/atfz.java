package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfz extends aonm implements aooz {
    public static final atfz a;
    private static volatile aopf d;
    public int b;
    public atfx c;
    private byte e = 2;

    static {
        atfz atfzVar = new atfz();
        a = atfzVar;
        aonm.registerDefaultInstance(atfz.class, atfzVar);
    }

    private atfz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf7b0䏢\uf7b0䏢\u0001\u0000\u0000\u0001\uf7b0䏢ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atfz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atfz.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
