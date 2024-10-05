package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowa extends aonm implements aooz {
    public static final aowa a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aulq j;
    private apxf k;
    private aota l;
    private byte m = 2;

    static {
        aowa aowaVar = new aowa();
        a = aowaVar;
        aonm.registerDefaultInstance(aowa.class, aowaVar);
    }

    private aowa() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\u000b\nᐉ\u0006\u000bᐉ\u0000", new Object[]{"c", "e", "f", "g", "h", "i", "k", "l", "j", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aowa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aowa.class) {
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
