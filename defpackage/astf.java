package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astf extends aonm implements aooz {
    public static final astf a;
    private static volatile aopf i;
    public int b;
    public long c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public aste h;
    private boolean j;
    private aulq k;
    private astg l;
    private byte m = 2;
    public aony g = emptyProtobufList();

    static {
        astf astfVar = new astf();
        a = astfVar;
        aonm.registerDefaultInstance(astf.class, astfVar);
    }

    private astf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0007\u0001ဂ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0006\tᐉ\u0005\nᐉ\b", new Object[]{"b", "c", "j", "d", "e", "f", "g", apmh.class, "l", "k", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new astf();
            case NEW_BUILDER:
                return new aone((byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (astf.class) {
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
