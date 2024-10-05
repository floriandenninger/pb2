package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atje extends aonm implements aooz {
    public static final atje a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aulq e;
    private aqyg f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aota k;
    private aulq l;
    private aulq m;
    private apxf n;
    private byte o = 2;

    static {
        atje atjeVar = new atje();
        a = atjeVar;
        aonm.registerDefaultInstance(atje.class, atjeVar);
    }

    private atje() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nᐉ\t\u000bᐉ\n\fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new atje();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atje.class) {
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
