PGDMP                 
        y        	   ecommerce    13.3    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    24844 	   ecommerce    DATABASE     ^   CREATE DATABASE ecommerce WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.UTF-8';
    DROP DATABASE ecommerce;
                postgres    false            �            1259    24858    product    TABLE     p   CREATE TABLE public.product (
    id bigint NOT NULL,
    name character varying,
    price double precision
);
    DROP TABLE public.product;
       public         heap    postgres    false            �            1259    24866    product_transactions    TABLE     o   CREATE TABLE public.product_transactions (
    idproduct bigint NOT NULL,
    idtransaction bigint NOT NULL
);
 (   DROP TABLE public.product_transactions;
       public         heap    postgres    false            �            1259    24871    review    TABLE     �   CREATE TABLE public.review (
    id bigint NOT NULL,
    iduser bigint,
    idproduct bigint,
    text character varying,
    rating bigint
);
    DROP TABLE public.review;
       public         heap    postgres    false            �            1259    24853    transaction    TABLE     l   CREATE TABLE public.transaction (
    id bigint NOT NULL,
    iduser bigint,
    import double precision
);
    DROP TABLE public.transaction;
       public         heap    postgres    false            �            1259    24845    user    TABLE     S   CREATE TABLE public."user" (
    id bigint NOT NULL,
    name character varying
);
    DROP TABLE public."user";
       public         heap    postgres    false            A           2606    24865    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public            postgres    false    202            C           2606    24870 .   product_transactions product_transactions_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.product_transactions
    ADD CONSTRAINT product_transactions_pkey PRIMARY KEY (idtransaction, idproduct);
 X   ALTER TABLE ONLY public.product_transactions DROP CONSTRAINT product_transactions_pkey;
       public            postgres    false    203    203            E           2606    24875    review review_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.review
    ADD CONSTRAINT review_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.review DROP CONSTRAINT review_pkey;
       public            postgres    false    204            ?           2606    24857    transaction transaction_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.transaction
    ADD CONSTRAINT transaction_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.transaction DROP CONSTRAINT transaction_pkey;
       public            postgres    false    201            =           2606    24852    user user_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            postgres    false    200           