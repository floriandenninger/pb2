package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdm extends aonm implements aooz {
    public static final asdm a;
    private static volatile aopf i;
    public int b;
    public arnb c;
    public avyg f;
    public boolean g;
    public atia h;
    private byte j = 2;
    public String d = "";
    public int e = 1;

    static {
        asdm asdmVar = new asdm();
        a = asdmVar;
        aonm.registerDefaultInstance(asdm.class, asdmVar);
    }

    private asdm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", asaq.i, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asdm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (asdm.class) {
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
