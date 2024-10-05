package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhi extends aonm implements aooz {
    public static final arhi a;
    private static volatile aopf k;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public boolean f;
    public aqyg g;
    public apxf h;
    private args l;
    private aota m;
    private byte n = 2;
    public aony i = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        arhi arhiVar = new arhi();
        a = arhiVar;
        aonm.registerDefaultInstance(arhi.class, arhiVar);
    }

    private arhi() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0007\bည\b\tᐉ\u0002\nဇ\u0003\u000e\u001b\u000fᐉ\u0005\u0010ᐉ\u0006", new Object[]{"b", "c", "d", "l", "m", "j", "e", "f", "i", asus.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arhi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arhi.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
