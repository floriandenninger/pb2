package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aucg extends aonm implements aooz {
    public static final aucg a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aucp e;
    private aucp f;
    private aplk g;
    private aucq h;
    private aucq i;
    private aplk j;
    private aplk k;
    private aplk l;
    private aplk m;
    private byte n = 2;

    static {
        aucg aucgVar = new aucg();
        a = aucgVar;
        aonm.registerDefaultInstance(aucg.class, aucgVar);
    }

    private aucg() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\t", new Object[]{"c", "d", "h", "i", "j", "k", "l", "e", "f", "g", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aucg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aucg.class) {
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
