package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aslz extends aonm implements aooz {
    public static final aslz a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aulq f;
    private aulq g;
    private aqyg h;
    private apxf i;
    private apxf j;
    private apxf k;
    private aqyg l;
    private aota m;
    private byte n = 2;

    static {
        aslz aslzVar = new aslz();
        a = aslzVar;
        aonm.registerDefaultInstance(aslz.class, aslzVar);
    }

    private aslz() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\r\n\u0000\u0000\n\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\fᐉ\u000b\rᐉ\f", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aslz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aslz.class) {
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
