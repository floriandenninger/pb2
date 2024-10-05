package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atlh extends aonm implements aooz {
    public static final atlh a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aota h;
    private aulq i;
    private aulq j;
    private aulq k;
    private aulq l;
    private apxf m;
    private aulq n;
    private byte o = 2;

    static {
        atlh atlhVar = new atlh();
        a = atlhVar;
        aonm.registerDefaultInstance(atlh.class, atlhVar);
    }

    private atlh() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\n\tᐉ\u000b\nᐉ\u0003\u000bᐉ\b\fᐉ\t", new Object[]{"c", "d", "e", "f", "h", "i", "j", "m", "n", "g", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atlh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atlh.class) {
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
