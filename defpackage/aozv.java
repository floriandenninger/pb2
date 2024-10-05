package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozv extends aonm implements aooz {
    public static final aozv a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aozv aozvVar = new aozv();
        a = aozvVar;
        aonm.registerDefaultInstance(aozv.class, aozvVar);
    }

    private aozv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﻊ⍒\uf28e園\u0002\u0000\u0000\u0002ﻊ⍒ᐼ\u0000\uf28e園ᐼ\u0000", new Object[]{"c", "b", auap.class, atkq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aozv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aozv.class) {
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
